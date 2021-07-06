public class Admin {
    // Singleton
    private static Admin admin;
    private Admin() {};
    public static Admin getInstance() {
        if(admin == null) {
            admin = new Admin();
        }
        return admin;
    }
}
