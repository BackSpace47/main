@echo off
color 12
Title Shapeless Recipe by Backspace Tech


set /p ItemVar=Enter The Item You Will Be Crafting:
cls
set /p NumVar=Enter The Item Ammount:

cls





ECHO ......................................................
Echo Below Are The Items To Be Crafted With
ECHO ......................................................




set /p Crafting1Var=Enter The First Item Name:



ECHO.
ECHO ......................................................
Echo Would you like to add another Item?
ECHO ......................................................
ECHO.




ECHO 1 - Yes-Add Item
ECHO 2 - No-Continue To Crafting Grid
CHOICE /C:12
IF ERRORLEVEL 1 SET M=1
IF ERRORLEVEL 2 SET M=2

IF %M%==1 GOTO To2
IF %M%==2 GOTO ToDoneCraftingItems














:To2
cls

set /p Crafting2Var=Enter The Seccond Item Name:



ECHO.
ECHO ......................................................
Echo Would you like to add another Item?
ECHO ......................................................
ECHO.





ECHO 1 - Yes-Add Item
ECHO 2 - No-Continue To Crafting Grid
CHOICE /C:12
IF ERRORLEVEL 1 SET M=1
IF ERRORLEVEL 2 SET M=2

IF %M%==1 GOTO To3
IF %M%==2 GOTO ToDoneCraftingItems



















:To3
cls








set /p Crafting3Var=Enter The Third Item Name:

SET HijackVar3=, new ItemStack(%Crafting3Var%)

ECHO.
ECHO ......................................................
Echo Would you like to add another Item?
ECHO ......................................................
ECHO.





ECHO 1 - Yes-Add Item
ECHO 2 - No-Continue To Crafting Grid
CHOICE /C:12
IF ERRORLEVEL 1 SET M=1
IF ERRORLEVEL 2 SET M=2

IF %M%==1 GOTO To4
IF %M%==2 GOTO ToDoneCraftingItems


















:To4
cls




set /p Crafting4Var=Enter The Fourth Item Name:

SET HijackVar4=, new ItemStack(%Crafting4Var%)
ECHO.
ECHO ......................................................
Echo Would you like to add another Item?
ECHO ......................................................
ECHO.





ECHO 1 - Yes-Add Item
ECHO 2 - No-Continue To Crafting Grid
CHOICE /C:12
IF ERRORLEVEL 1 SET M=1
IF ERRORLEVEL 2 SET M=2

IF %M%==1 GOTO To5
IF %M%==2 GOTO ToDoneCraftingItems















:To5
cls



set /p Crafting5Var=Enter The Fith Item Name:
SET HijackVar5=, new ItemStack(%Crafting5Var%)


ECHO.
ECHO ......................................................
Echo Would you like to add another Item?
ECHO ......................................................
ECHO.




ECHO 1 - Yes-Add Item
ECHO 2 - No-Continue To Crafting Grid
CHOICE /C:12
IF ERRORLEVEL 1 SET M=1
IF ERRORLEVEL 2 SET M=2

IF %M%==1 GOTO To6
IF %M%==2 GOTO ToDoneCraftingItems









:To6

cls




set /p Crafting6Var=Enter The Sixth Item Name:


SET HijackVar6=, new ItemStack(%Crafting6Var%)


ECHO.
ECHO ......................................................
Echo Would you like to add another Item?
ECHO ......................................................
ECHO.




ECHO 1 - Yes-Add Item
ECHO 2 - No-Continue To Crafting Grid
CHOICE /C:12
IF ERRORLEVEL 1 SET M=1
IF ERRORLEVEL 2 SET M=2

IF %M%==1 GOTO To7
IF %M%==2 GOTO ToDoneCraftingItems









:To7
cls

set /p Crafting7Var=Enter The Seventh Item Name:
SET HijackVar7=, new ItemStack(%Crafting7Var%)


ECHO.
ECHO ......................................................
Echo Would you like to add another Item?
ECHO ......................................................
ECHO.





ECHO 1 - Yes-Add Item
ECHO 2 - No-Continue To Crafting Grid
CHOICE /C:12
IF ERRORLEVEL 1 SET M=1
IF ERRORLEVEL 2 SET M=2

IF %M%==1 GOTO To8
IF %M%==2 GOTO ToDoneCraftingItems









:To8
cls



set /p Crafting8Var=Enter The Eighth Item Name:

SET HijackVar8=, new ItemStack(%Crafting8Var%)


ECHO.
ECHO ......................................................
Echo Would you like to add another Item?
ECHO ......................................................
ECHO.





ECHO 1 - Yes-Add Item
ECHO 2 - No-Continue To Crafting Grid
CHOICE /C:12
IF ERRORLEVEL 1 SET M=1
IF ERRORLEVEL 2 SET M=2

IF %M%==1 GOTO To9
IF %M%==2 GOTO ToDoneCraftingItems












:To9
cls






set /p Crafting9Var=Enter The Nineth Item Name:
SET HijackVar9=, new ItemStack(%Crafting9Var%)


:ToDoneCraftingItems



:UPDATE







Echo Finished!! 


Echo Paradox Coders Team






pause




echo GameRegistry.addShapelessRecipe(new ItemStack (%ItemVar%,%NumVar%), new ItemStack (%Crafting1Var%), new ItemStack (%Crafting2Var%)%HijackVar3%%HijackVar4%%HijackVar5%%HijackVar6%%HijackVar7%%HijackVar8%%HijackVar9%);>>ShapelessRecipe.txt