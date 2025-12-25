// package p44_library_exercise;

class lib{
    String[] books = new String[10] ;
    boolean[] issued = new boolean[10] ;
    int filled_book ;
    public lib(){
        books[0] = "1Book" ;
        books[1] = "2Book";
        books[2] = "3Book" ;
        filled_book =2 ;
    }
    void showBooks(){
        System.out.println("Books are: ");
        for(int i=0 ; i<=filled_book ; i++){
            System.out.println(i+ ". " + books[i]) ;
        }
    }
    void addBook(String book){
        if(filled_book<books.length){
            books[filled_book+1] = book ;
            filled_book++ ; 
            System.out.println("Successfully added book: "+ book) ;
        }
        else{
            System.out.println("Library is full.") ;
        }

    }
    void issueBook(int n){
        if(n>filled_book){
            System.out.println("Book is not available in library") ;
        }
        else if(issued[n] == true){
            System.out.println("Book is unavailable, it is already issued.") ;
        }
        else{
            issued[n] = true ;
            System.out.println("Successfully issued a book") ;
        }

    }
    void returnBook(int n){
        if(n>filled_book){
            System.out.println("Not a library book") ;
        }
        else if(n<=filled_book && issued[n] == true){
            System.out.println("Succesfully Return") ;
            issued[n] = false ;

        }

    }
    

}

public class library {
    public static void main(String [] args){
        // You have to implement a library using Java class Library
        // Methods: addBook , issueBook , returnBook,showAvailableBooks
        // Properties: Array to store the available books
        // Arrays to store the issued books
        //

        lib obj = new lib() ;
        obj.showBooks() ;
        obj.addBook("4book");
        obj.showBooks() ;
        obj.addBook("5book");
        obj.addBook("6book");
        obj.addBook("7book");
        obj.showBooks() ;
        obj.addBook("8Book");
        obj.addBook("9Book");
        obj.addBook("10Book") ;
        obj.showBooks() ;

        // boolean [] b = new boolean[9] ;
        // b[5] = true ;
        // System.out.println(b[4]) ;

        for(int i=0 ; i<obj.issued.length ; i++){
            System.out.println(i + "." + obj.issued[i]) ;

        }
        obj.issueBook(1);
        obj.issueBook(9);
        for(int i=0 ; i<obj.issued.length ; i++){
            System.out.println(i + "." + obj.issued[i]) ;

        }

        obj.returnBook(9);
        for(int i=0 ; i<obj.issued.length ; i++){
            System.out.println(i + "." + obj.issued[i]) ;

        }
        
        
        





    }
    
}
