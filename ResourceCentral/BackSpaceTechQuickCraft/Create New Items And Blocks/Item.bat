


@echo off
Color 12
set /p SomeVar=Enter Some Text Please: 

echo %SomeVar% >ItemQuickCode.txt



echo public static Item %SomeVar%;>ItemQuickCode.txt



echo %SomeVar% = new item%SomeVar%().setUnlocalizedName("%SomeVar%").setTextureName(modid + ":" + "%SomeVar%").setCreativeTab(RPCoreITab);>>ItemQuickCode.txt



echo Recipies.registerItem(%SomeVar%,"%SomeVar%");>>ItemQuickCode.txt