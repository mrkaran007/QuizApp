package com.mrk.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWER: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Austria", "Armenia",
            1
        )
        questionList.add(que1)

        // 2
        val que2 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Australia",
            "Austria", "Armenia",
            2
        )
        questionList.add(que2)

        // 3
        val que3 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina", "Australia",
            "Austria", "Brazil",
            4
        )
        questionList.add(que3)

        // 4
        val que4 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Argentina", "Australia",
            "India", "Armenia",
            3
        )
        questionList.add(que4)

        // 5
        val que5 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Argentina", "Fiji",
            "Austria", "Armenia",
            2
        )
        questionList.add(que5)


        return questionList
    }
}