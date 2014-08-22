Color 12
@echo off
set /p SomeVar=Enter Some Text Please: 
echo %SomeVar% >BlockQuickCode.txt
echo public static Block %SomeVar%;>BlockQuickCode.txt
echo %SomeVar%= new blockRPBlock%SomeVar%(Material.rock).setCreativeTab(RPCoreBTab).setBlockName("%SomeVar%").setBlockTextureName(modid + ":" + "%SomeVar%").setHardness(5F).setResistance(1F);>>BlockQuickCode.txt
echo Recipies.registerBlock(%SomeVar%,"%SomeVar%");>>BlockQuickCode.txt