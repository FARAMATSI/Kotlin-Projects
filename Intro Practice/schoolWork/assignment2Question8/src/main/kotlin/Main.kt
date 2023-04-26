fun check(toCheck:Char,str:String){
    var frequency = 0;
    for (i in 0  until   str.length) {
        if (str[i] == toCheck)
            frequency++;
    }
    println("The frequency of $toCheck in the string '$str' is $frequency")
}

fun main() {
    // Here i want to search for the letter g in my name string Farai
    check('g',"Farai");

    // Searching for the letter a in my name Farai
    check('a',"Farai")

}