
@echo off
title Git Commit
color 12

type NUL > Commit.txt




set /p SomeVar=Enter Some Text Please







echo %SomeVar%> Commit.txt

dir Commit.txt



git commit -m "%SomeVar%"

pause

type NUL > Commit.txt

cls
exit












backspace notes


@echo off
color 12

type NUL > Commit.txt




echo|set /P ="hello" > Commit.txt

dir Commit.txt



git commit -m "MineFacility Update"

pause

type NUL > Commit.txt





set /p SomeVar=What is your favourite colour? 
echo Favourite colour: %SomeVar%