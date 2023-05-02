public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Олег";
        post.passport = "0707 № 07070707";
        post.patronymic = "Иванович";
        post.phone = "+7 (999) 999-99-99";
        post.surname = "Видов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 12;
        post.birthday.month = 12;
        post.birthday.year = 2000;
    }


}
