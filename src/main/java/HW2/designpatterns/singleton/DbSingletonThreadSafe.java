package HW2.designpatterns.singleton;
//Lazy landed is an improvement to the performance of the code
public class DbSingletonThreadSafe {
    //volatile keyword makes sure that instance will remain a singleton through any jdm changes.
    private static volatile DbSingletonThreadSafe instance = null;

    private DbSingletonThreadSafe() {
        if(instance != null){
            throw new RuntimeException("Use get instance method to create");
        }

    }

    //Custom with a DbSingleton to have a getInstance method.
    public static DbSingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (DbSingletonThreadSafe.class){
                if(instance == null){
                    instance = new DbSingletonThreadSafe();
                }
            }

        }
        return instance;
    }
}
