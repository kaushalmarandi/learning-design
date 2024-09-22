package m.kash.lldpatternsseptember2024.Factory;

public class Flutter {
    private String platform;

//    public Flutter(String platform){
//        this.platform=platform;
//    }

    //Non factory methods

    void refreshUI(){
        System.out.println("Refresh UI");
    }

    void stTheme(){
        System.out.println("Set Theme");
    }


    public UIFactory getUIFactory(Supportedplatforms platform){
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }

}
