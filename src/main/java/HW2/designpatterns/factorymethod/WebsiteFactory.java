package HW2.designpatterns.factorymethod;

public class WebsiteFactory {
    public static Website getWebsite(String siteType) {
        switch (siteType) {
            case "blog": {
                return new Blog();
            }

            case "shop": {
                return new Shop();
            }
            default : {
                return null;
            }

        }
    }
}
