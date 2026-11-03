public class LibraryMember {
    private final int memberId;
    private String name;
    private String date;

    public LibraryMember(int memberId, String name, String date){
        this.memberId = memberId;
        this.name = name;
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void memberInfo(){
        System.out.println("Użytknownik: " + name + " data urodzenia: " + date + " numer identyfikacyjny konta: " + memberId);

    }
}
