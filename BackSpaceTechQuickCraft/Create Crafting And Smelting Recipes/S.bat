@echo off
color 12

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

SET HijackVar3=, 'c', new ItemStack(%Crafting3Var%)

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

SET HijackVar4=, 'd', new ItemStack(%Crafting4Var%)
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
SET HijackVar5=, 'e', new ItemStack(%Crafting5Var%)


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


SET HijackVar6=, 'f', new ItemStack(%Crafting6Var%)


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
SET HijackVar7=, 'g', new ItemStack(%Crafting7Var%)


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

SET HijackVar8=, 'h', new ItemStack(%Crafting8Var%)


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
SET HijackVar9=, 'i', new ItemStack(%Crafting9Var%)


:ToDoneCraftingItems
goto skipmess


REM ignore this this is a upcoming feture that I cant figure out lol


cls



Echo (%Crafting1Var%=a) (%Crafting2Var%=b) (%Crafting3Var%=c) (%Crafting4Var%=d) (%Crafting5Var%=e) 
echo (%Crafting6Var%=f) (%Crafting7Var%=g) (%Crafting8Var%=h) (%Crafting9Var%=i) 

:refresh


Echo What Item Would you like in your que? Hint: Press the Letter
CHOICE /c:abcdefghi

  if errorlevel a SET a
  if errorlevel b SET b
  if errorlevel c SET c
  if errorlevel d SET d
  if errorlevel e SET e
  if errorlevel f SET f
  if errorlevel g SET g
  if errorlevel h SET h
  if errorlevel i SET i




IF %M%==a GOTO a
IF %M%==b GOTO b
IF %M%==c GOTO c
IF %M%==d GOTO d
IF %M%==e GOTO e
IF %M%==f GOTO f
IF %M%==g GOTO g
IF %M%==h GOTO h
IF %M%==i GOTO i





:a
Echo Where Would You Like This To Go?

CHOICE /C:123456789
IF ERRORLEVEL 1 SET M=1
IF ERRORLEVEL 2 SET M=2
IF ERRORLEVEL 3 SET M=3
IF ERRORLEVEL 4 SET M=4
IF ERRORLEVEL 5 SET M=5
IF ERRORLEVEL 6 SET M=6
IF ERRORLEVEL 7 SET M=7
IF ERRORLEVEL 8 SET M=8
IF ERRORLEVEL 9 SET M=9


IF %M%==1 GOTO a1
IF %M%==2 GOTO 
IF %M%==3 GOTO 
IF %M%==4 GOTO 
IF %M%==5 GOTO 
IF %M%==6 GOTO 
IF %M%==7 GOTO 
IF %M%==8 GOTO 
IF %M%==9 GOTO




:b

:c

:d

:e

:f

:g

:h

:i



:a1
%a1% = a
goto refresh
:a2

:a3

:a4

:a5

:a6

:a7

:a8

:a9



:UPDATE
  cls
  echo                               
  echo                    Press the number where you want to put a letter.     
  echo.
  echo                                       7 8 9 
  echo                                       4 5 6
  echo                                       1 2 3
  echo.
  echo                                     :      :
  echo                                %t1% : %t2% : %t3%
  echo                                   ....:...:....
  echo                                %t4% : %t5% : %t6%
  echo                                   ....:...:....
  echo                                %t7% : %t8% : %t9%
  echo                                     :      :










Rem end ignore of code lol







:skipmess
         



        







:UPDATE




  cls

Echo (%Crafting1Var%=a) (%Crafting2Var%=b) (%Crafting3Var%=c) (%Crafting4Var%=d) (%Crafting5Var%=e) 
echo (%Crafting6Var%=f) (%Crafting7Var%=g) (%Crafting8Var%=h) (%Crafting9Var%=i) 


        
  echo                       Please Choose Your Crafting Material     
  echo.
  echo                                       1 2 3
  echo                                       4 5 6
  echo                                       7 8 9
  echo.
 echo #                                        
  echo                                ################     
  echo                                #%t1%:%t2%:%t3%#
  echo                                #    :    :    #
  echo                                #%t4%:%t5%:%t6%#
  echo                                #    :    :    #
  echo                                #%t7%:%t8%:%t9%#
  echo                                ################     
  echo #


set /p t1=Crafting Grid Slot One:



  cls

Echo (%Crafting1Var%=a) (%Crafting2Var%=b) (%Crafting3Var%=c) (%Crafting4Var%=d) (%Crafting5Var%=e) 
echo (%Crafting6Var%=f) (%Crafting7Var%=g) (%Crafting8Var%=h) (%Crafting9Var%=i) 



                              
  echo                       Please Choose Your Crafting Material     
  echo.
  echo                                       1 2 3 
  echo                                       4 5 6
  echo                                       7 8 9
  echo.
  echo #
  echo                                ################     
  echo                                #%t1%:%t2%:%t3%#
  echo                                #    :    :    #
  echo                                #%t4%:%t5%:%t6%#
  echo                                #    :    :    #
  echo                                #%t7%:%t8%:%t9%#
  echo                                ################     
  echo #






set /p t2=Crafting Grid Slot Two:




  cls

Echo (%Crafting1Var%=a) (%Crafting2Var%=b) (%Crafting3Var%=c) (%Crafting4Var%=d) (%Crafting5Var%=e) 
echo (%Crafting6Var%=f) (%Crafting7Var%=g) (%Crafting8Var%=h) (%Crafting9Var%=i) 



      
  echo                       Please Choose Your Crafting Material     
  echo.
  echo                                       1 2 3 
  echo                                       4 5 6
  echo                                       7 8 9
  echo.
  echo #
  echo                                ################     
  echo                                #%t1%:%t2%:%t3%#
  echo                                #    :    :    #
  echo                                #%t4%:%t5%:%t6%#
  echo                                #    :    :    #
  echo                                #%t7%:%t8%:%t9%#
  echo                                ################     
  echo #






set /p t3=Crafting Grid Slot three:







  cls

Echo (%Crafting1Var%=a) (%Crafting2Var%=b) (%Crafting3Var%=c) (%Crafting4Var%=d) (%Crafting5Var%=e) 
echo (%Crafting6Var%=f) (%Crafting7Var%=g) (%Crafting8Var%=h) (%Crafting9Var%=i) 



  
  echo                       Please Choose Your Crafting Material     
  echo.
  echo                                       1 2 3 
  echo                                       4 5 6
  echo                                       7 8 9
  echo.
  echo #
  echo                                ################     
  echo                                #%t1%:%t2%:%t3%#
  echo                                #    :    :    #
  echo                                #%t4%:%t5%:%t6%#
  echo                                #    :    :    #
  echo                                #%t7%:%t8%:%t9%#
  echo                                ################     
  echo #






set /p t4=Crafting Grid Slot four:












  cls

Echo (%Crafting1Var%=a) (%Crafting2Var%=b) (%Crafting3Var%=c) (%Crafting4Var%=d) (%Crafting5Var%=e) 
echo (%Crafting6Var%=f) (%Crafting7Var%=g) (%Crafting8Var%=h) (%Crafting9Var%=i) 



 
  echo                       Please Choose Your Crafting Material     
  echo.
  echo                                       1 2 3 
  echo                                       4 5 6
  echo                                       7 8 9
  echo.
  echo #
  echo                                ################     
  echo                                #%t1%:%t2%:%t3%#
  echo                                #    :    :    #
  echo                                #%t4%:%t5%:%t6%#
  echo                                #    :    :    #
  echo                                #%t7%:%t8%:%t9%#
  echo                                ################     
  echo #





set /p t5=Crafting Grid Slot five:




cls








Echo (%Crafting1Var%=a) (%Crafting2Var%=b) (%Crafting3Var%=c) (%Crafting4Var%=d) (%Crafting5Var%=e) 
echo (%Crafting6Var%=f) (%Crafting7Var%=g) (%Crafting8Var%=h) (%Crafting9Var%=i) 



  
  echo                       Please Choose Your Crafting Material     
  echo.
  echo                                       1 2 3 
  echo                                       4 5 6
  echo                                       7 8 9
  echo.
 echo #
  echo                                ################     
  echo                                #%t1%:%t2%:%t3%#
  echo                                #    :    :    #
  echo                                #%t4%:%t5%:%t6%#
  echo                                #    :    :    #
  echo                                #%t7%:%t8%:%t9%#
  echo                                ################     
  echo #






set /p t6=Crafting Grid Slot six:









cls








Echo (%Crafting1Var%=a) (%Crafting2Var%=b) (%Crafting3Var%=c) (%Crafting4Var%=d) (%Crafting5Var%=e) 
echo (%Crafting6Var%=f) (%Crafting7Var%=g) (%Crafting8Var%=h) (%Crafting9Var%=i) 



          
  echo                       Please Choose Your Crafting Material     
  echo.
  echo                                       1 2 3 
  echo                                       4 5 6
  echo                                       7 8 9
  echo.
   echo #
  echo                                ################     
  echo                                #%t1%:%t2%:%t3%#
  echo                                #    :    :    #
  echo                                #%t4%:%t5%:%t6%#
  echo                                #    :    :    #
  echo                                #%t7%:%t8%:%t9%#
  echo                                ################     
  echo #





set /p t7=Crafting Grid Slot seven:










cls








Echo (%Crafting1Var%=a) (%Crafting2Var%=b) (%Crafting3Var%=c) (%Crafting4Var%=d) (%Crafting5Var%=e) 
echo (%Crafting6Var%=f) (%Crafting7Var%=g) (%Crafting8Var%=h) (%Crafting9Var%=i) 



   
  echo                       Please Choose Your Crafting Material     
  echo.
  echo                                       1 2 3 
  echo                                       4 5 6
  echo                                       7 8 9
  echo.
 echo #
  echo                                ################     
  echo                                #%t1%:%t2%:%t3%#
  echo                                #    :    :    #
  echo                                #%t4%:%t5%:%t6%#
  echo                                #    :    :    #
  echo                                #%t7%:%t8%:%t9%#
  echo                                ################     
  echo #






set /p t8=Crafting Grid Slot eight:









cls








Echo (%Crafting1Var%=a) (%Crafting2Var%=b) (%Crafting3Var%=c) (%Crafting4Var%=d) (%Crafting5Var%=e) 
echo (%Crafting6Var%=f) (%Crafting7Var%=g) (%Crafting8Var%=h) (%Crafting9Var%=i) 



  
  echo                       Please Choose Your Crafting Material     
  echo.
  echo                                       1 2 3 
  echo                                       4 5 6
  echo                                       7 8 9
  echo.
  


   echo #
  echo                                ################     
  echo                                #%t1%:%t2%:%t3%#
  echo                                #    :    :    #
  echo                                #%t4%:%t5%:%t6%#
  echo                                #    :    :    #
  echo                                #%t7%:%t8%:%t9%#
  echo                                ################     
  echo #






set /p t9=Crafting Grid Slot nine:

cls








Echo (%Crafting1Var%=a) (%Crafting2Var%=b) (%Crafting3Var%=c) (%Crafting4Var%=d) (%Crafting5Var%=e) 
echo (%Crafting6Var%=f) (%Crafting7Var%=g) (%Crafting8Var%=h) (%Crafting9Var%=i) 



  
  echo                       Please Choose Your Crafting Material     
  echo.
  echo                                       1 2 3 
  echo                                       4 5 6
  echo                                       7 8 9
  echo.
  


  echo #
  echo                                ################     
  echo                                #%t1%:%t2%:%t3%#
  echo                                #    :    :    #
  echo                                #%t4%:%t5%:%t6%#
  echo                                #    :    :    #
  echo                                #%t7%:%t8%:%t9%#
  echo                                ################     
  echo #





Echo Finished!! 


Echo Paradox Coders Team



pause
















echo GameRegistry.addShapedRecipe(new ItemStack(%ItemVar%,%NumVar%), "%t1%%t2%%t3%", "%t4%%t5%%t6%", "%t7%%t8%%t9%", 'a', new ItemStack(%Crafting1Var%), 'b', new ItemStack(%Crafting2Var%)%HijackVar3%%HijackVar4%%HijackVar5%%HijackVar6%%HijackVar7%%HijackVar8%%HijackVar9%);>>Recipe.txt