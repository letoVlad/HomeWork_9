public class Main {
    public static void main(String[] args) {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + middleName + " " + firstName;
        System.out.println(fullName);
        //задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //задание 3
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);
    }
}