Color 12
@echo off


ECHO.
ECHO .................................................................................
Echo Would you like to create a Item2Block, Block2Item, Block2Block Item2Item recipe?
ECHO .................................................................................
ECHO.


ECHO 1 - Item2Block
ECHO 2 - Block2Item
echo 3 - Block2Block
echo 4 - Item2Item

CHOICE /C:1234
IF ERRORLEVEL 1 SET M=1
IF ERRORLEVEL 2 SET M=2
IF Errorlevel 3 SET M=3
IF Errorlevel 4 SET M=4







IF %M%==1 GOTO item2block
IF %M%==2 GOTO block2item
IF %M%==3 GOTO block2block
IF %M%==4 GOTO item2item
















:item2block




echo Recipies.registerSmeltingItemToBlockWUM(%InVar%,%OutVar%,5F);>>SmeltingItemToBlock.txt



Echo Finished!! 


Echo Paradox Coders Team



pause
cls
exit















:block2item









set /p InVar=Enter The Item You Will Be Smelting:
cls
set /p OutVar=Enter The Item OutPut:
cls








echo Recipies.registerSmeltingBlockToItemWUM(%InVar%,%OutVar%,5F);>>SmeltingBlockToItem.txt



Echo Finished!! 


Echo Paradox Coders Team



pause


 
cls
exit









:block2block


set /p InVar=Enter The Item You Will Be Smelting:
cls
set /p OutVar=Enter The Item OutPut:
cls








echo Recipies.registerSmeltingBlockWUM(%InVar%,%OutVar%,5F);>>SmeltingBlockToBlock.txt






Echo Finished!! 


Echo Paradox Coders Team



pause



cls
exit










:item2item

set /p InVar=Enter The Item You Will Be Smelting:
cls
set /p OutVar=Enter The Item OutPut:
cls








echo Recipies.registerSmeltingItemWUM(%InVar%,%OutVar%,5F);>>SmeltingItemToBlock.txt



Echo Finished!! 


Echo Paradox Coders Team



pause
cls
exit




