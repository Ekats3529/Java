final class Emperor {
    private static Emperor emp;
    private Emperor() { }
    public static synchronized Emperor getImperator() {
        if (emp == null) {
            emp = new Emperor();
            System.out.println("\tA new Emperor is in your country.");
        }
        else {
            System.out.println("\tYou can only have one Emperor");
            System.out.println("\tOr it is a revolution?!");
        }
        return emp;
    }
}

class Singleton {
    public static void main(String[] args) {
        System.out.println("The Emperor takes office");
        Emperor emp1 = Emperor.getImperator();
        System.out.println("Trying to take another...");
        //Captain captain2 = new Captain();  ОШИБКА КОМПИЛЯЦИИ
        Emperor emp2 = Emperor.getImperator();

        if (emp1 == emp2){
            System.out.println("This Emperor already at his post");
        }
    }
}
