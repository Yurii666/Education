package java_10thEdition;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Обект типа String по умолчанию";
    }
}
