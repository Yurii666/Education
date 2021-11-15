package Stepic.CommentFilteringSystem;

interface TextAnalyzer {
    Label processText(String text);
}
enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

class TooLongTextAnalyzer implements TextAnalyzer{
    int maxLenght(){
        return 0;
    }

}

abstract class KeywordAnalyzer implements TextAnalyzer{
    abstract String[] getKeywords();
    abstract Label getLabel();
}
class SpamAnalyzer implements KeywordAnalyzer{

}
class NegativeTextAnalyzer implements TextAnalyzer{

}


public class TextAnalyzerDemo {
    public static void main(String[] args) {

    }
}
