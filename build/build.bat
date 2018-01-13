@echo off
cls
echo -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
echo -------------------------------------------------- # CREATING BUILD WITHOUT JUNIT TEST CASE EXECUTION # -------------------------------------------------------------
echo -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
cd ..
rem mvn dependency:tree -Dverbose=true
rem BUILD WITHOUT SENCHA(Default for Local)
rem mvn -T 4 -P env-dev -Dmaven.test.skip=true clean package
rem BUILD WITHOUT SENCHA(Default for Staging and Prod)
rem mvn -T 4 -P env-non-dev -Dmaven.test.skip=true clean package


rem BUILD WITH SENCHA
rem mvn -T 4 -P env-dev,sencha -Dmaven.test.skip=true -Dsencha.build.args="testing" clean package
rem mvn -T 4 -P env-non-dev,sencha -Dmaven.test.skip=true -Dsencha.build.args="production" clean package

rem BUILD WITH QUICK CLEAN(FASTER THAN DEFAULT BUILD)
mvn -T 4 -P env-dev,qclean -Dmaven.test.skip=true clean install
rem mvn -T 4 -P env-dev,sencha,qclean -Dmaven.test.skip=true -Dsencha.build.type="testing" clean install

rem CLEAN TRASH FOLDER AT EOD WHEN YOU BUILD WITH QUICK CLEAN
rem mvn -T 4 clean  -P cleanTrash

pause