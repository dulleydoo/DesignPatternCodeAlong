package HW2.designpatterns.singleton;

public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);

        //test if it really is a singleton
        //DbSingleton instance2 = new DbSingleton(); //this does not work because its saying the constructor is private

        //another way to test an instance is to create another object and checking if its making a new object.
        //to check that you check the address that pops up when ran
        DbSingleton anotherInstance = DbSingleton.getInstance();
        System.out.println(anotherInstance);

        //result
        //designpatterns.singleton.DbSingleton@7d417077
        //designpatterns.singleton.DbSingleton@7d417077
        //both objects showed the same address
        //______________________________________________________________________________________________________________

        DbSingletonLazyLoading instance3 = DbSingletonLazyLoading.getInstance();
        System.out.println(instance);
        DbSingletonLazyLoading instance4 = DbSingletonLazyLoading.getInstance();
        System.out.println(instance);
    }
}
