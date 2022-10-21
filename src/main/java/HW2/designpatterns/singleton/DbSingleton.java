package HW2.designpatterns.singleton;
//Most commonly used design pattern due to its simplicity and problem it fixes

public class DbSingleton {
    //private static DbSingleton instance = new DbSingleton();
    //lazy loading
    private static DbSingleton instance = null;

    private DbSingleton(){

    }

    //Custom with a DbSingleton to have a getInstance method.
    public static DbSingleton getInstance(){
        return instance;
    }

}
/* requirements for a singleton
1. private static instance
2. private constructor so people cant use keyword new to make an instance of it
3. return instance to calling class when getInstance is called
 */

