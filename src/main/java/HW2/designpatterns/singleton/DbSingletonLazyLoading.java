package HW2.designpatterns.singleton;
//Lazy landed is an improvement to the performance of the code
public class DbSingletonLazyLoading {
    private static volatile DbSingletonLazyLoading instance = null;

    private DbSingletonLazyLoading() {
        if(instance != null){
            throw new RuntimeException("Use get instance method to create");
        }

    }

    //Custom with a DbSingleton to have a getInstance method.
    public static DbSingletonLazyLoading getInstance() {
        if (instance == null) {
            synchronized (DbSingletonLazyLoading.class){
                if(instance == null){
                    instance = new DbSingletonLazyLoading();
                }
            }

        }
        return instance;
    }
}


