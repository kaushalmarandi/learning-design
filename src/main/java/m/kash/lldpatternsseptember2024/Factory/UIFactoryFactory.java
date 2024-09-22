package m.kash.lldpatternsseptember2024.Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryForPlatform(Supportedplatforms platform){
        if(platform.equals(Supportedplatforms.ANDROID)){
            return new AndroidUIFactory();
        }else if (platform.equals(Supportedplatforms.IOS)){
            return new IosUIFactory();
        } else if (platform.equals(Supportedplatforms.WINDOWS)) {
            return new WindowsUIFactory();
        }
        return null;
    }
}
