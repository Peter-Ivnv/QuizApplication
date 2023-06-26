package com.ivanovpa.quizapplication;

import java.util.ArrayList;
import java.util.List;

public class QuestionsPack {

    private static List<QuestionsList> movieQuestions(){
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Что на самом деле представляет из себя легендарный зеленый код из «Матрицы»?",
                "Рецепт суши",
                "Рецепт пельменей",
                "Рецепт жаркого",
                "Рецепт Пад Тая",
                "Рецепт суши",
                "");

        final QuestionsList question2 = new QuestionsList
                ("Как зовут персонажа МитЛоуфа в «Шоу ужасов Рокки Хоррора»?",
                "Генри",
                "Эдди",
                "Чак",
                "Аль",
                "Эдди",
                "");

        final QuestionsList question3 = new QuestionsList
                ("Кто на самом деле рисовал Розу в «Титанике»?",
                "Леонардо ДиКаприо",
                "Билли Зейн",
                "Джеймс Кэмерон",
                "Кэти Бейтс",
                "Джеймс Кэмерон",
                "");

        final QuestionsList question4 = new QuestionsList
                ("Какого цвета полосатый свитер Фредди Крюгера?",
                "Красно-синего",
                "Оранжево-зеленого",
                "Красно-зеленого",
                "Оранжево-коричневого",
                "Красно-зеленого",
                "");

        final QuestionsList question5 = new QuestionsList
                ("Где снимали трилогию «Властелин колец»?",
                "В Ирландии",
                "В Исландии",
                "В Новой Зеландии",
                "В Австралии",
                "В Новой Зеландии",
                "");

        final QuestionsList question6 = new QuestionsList
                ("Кто стал первым темнокожим актером, получившим Оскар?",
                "Хэтти МакДэниел",
                "Сидни Пуатье",
                "Дороти Дэндридж",
                "Джеймс Эрл Джонс",
                "Хэтти МакДэниел",
                "");

        final QuestionsList question7 = new QuestionsList
                ("В какую страну отправился Форрест Гамп в составе сборной США по настольному теннису?",
                "Во Вьетнам",
                "В Китай",
                "В Швецию",
                "Во Францию",
                "В Китай",
                "");

        final QuestionsList question8 = new QuestionsList
                ("Какого ребенка не было в поездке на фабрику Вонки в фильме «Вилли Вонка и шоколадная фабрика»?",
                "Билли Варпа",
                "Веруки Солт",
                "Майка Тиви",
                "Чарли Бакета",
                "Билли Варпа",
                "");

        final QuestionsList question9 = new QuestionsList
                ("Какая из культовых сцен «Криминального чтива» была снята задом наперед?",
                "Танец Винсента и Мии",
                "Сцена передозировки Мии",
                "«Рояль с сыром»",
                "«Иезекииль 25:17»",
                "Сцена передозировки Мии",
                "");

        final QuestionsList question10 = new QuestionsList
                ("Кому принадлежал тот самый кот из «Крестного отца»?",
                "Фрэнсису Копполе",
                "Дайан Китон",
                "Аль Пачино",
                "Никому — животное было бездомным",
                "Никому — животное было бездомным",
                "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;
    }

    private static List<QuestionsList> cartoonQuestions(){
        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList
                ("Сколько гномов было у Белоснежки?",
                "6",
                "7",
                "8",
                "9",
                "7",
                "");

        final QuestionsList question2 = new QuestionsList
                ("Какого цвета была машина главного героя «Тачек»?",
                        "Красный",
                        "Черный",
                        "Синий",
                        "Зеленый",
                        "Красный",
                        "");

        final QuestionsList question3 = new QuestionsList
                ("Я ваш личный медицинский робот. Люблю помогать людям и всегда буду рядом с вами, если вы окажетесь в опасности. Кто я?",
                        "Астробой",
                        "Стальной гигант",
                        "Валли",
                        "Бэймакс",
                        "Бэймакс",
                        "");

        final QuestionsList question4 = new QuestionsList
                ("Какой мультфильм считается первым полнометражным компьютерным мультфильмом?",
                        "Шрек",
                        "История игрушек",
                        "Ледниковый период",
                        "Корпорация монстров",
                        "История игрушек",
                        "");

        final QuestionsList question5 = new QuestionsList
                ("Что от вранья росло у Пиноккио?",
                        "Руки",
                        "Ноги",
                        "Пальцы",
                        "Нос",
                        "Нос",
                        "");

        final QuestionsList question6 = new QuestionsList
                ("Кого искала Алиса в тёмной норе?",
                        "Белый заяц",
                        "Серый волк",
                        "Белый кролик",
                        "Белый медведь",
                        "Белый кролик",
                        "");

        final QuestionsList question7 = new QuestionsList
                ("Каким животным был Шер-Хан?",
                        "Тигр",
                        "Лев",
                        "Бык",
                        "Медведь",
                        "Тигр",
                        "");

        final QuestionsList question8 = new QuestionsList
                ("Цыпа думал, что ему на голову упало…",
                        "Яблоко",
                        "Небо",
                        "Озарение",
                        "Ведро",
                        "Небо",
                        "");

        final QuestionsList question9 = new QuestionsList
                ("Как звали друга Кристофера Робина?",
                        "Пятачок",
                        "Иа",
                        "Винни Пух",
                        "«Кенга",
                        "Винни Пух",
                        "");

        final QuestionsList question10 = new QuestionsList
                ("Этой мультипликационный герой родился на Луне, а потом очутился на Земле. Назовите его.",
                        "Незнайка",
                        "Лунтик",
                        "Птица-говорун",
                        "Чебурашка",
                        "Лунтик",
                        "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;
    }

    public static List<QuestionsList> getQuestions (String selectedTopicName){
        switch (selectedTopicName){
            case "movie": return movieQuestions();
            default: return cartoonQuestions();
        }
    }
}
