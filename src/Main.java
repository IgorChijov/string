public class Main {
    public static void main(String[] args) {
        {
            String firstName = "Ivan ";
            String middleName = "Ivanovich ";
            String lastName = "Ivanov ";
            String fullName = firstName + lastName + middleName;
            System.out.println("Фио сотрудника - " + fullName);
        }

        {
            String fullName = "Ivanov Ivan Ivanovich";
            System.out.println(fullName.toUpperCase());
        }

        {
            String fullName = "Иванов Семён Семёнович";
            fullName = fullName.replace('ё', 'е');
            System.out.println("Данные ФИО сотрудника - " + fullName);

        }
    }
}