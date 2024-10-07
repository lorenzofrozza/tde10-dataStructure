package Queue.ex02;

import Queue.ex01.Client;
import Queue.ex02.GenericQueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrintQueue {
    public static void main(String[] args) {
        GenericQueue<Document> docs = new GenericQueue<>(100);

        Document d1 = new Document("AP1", 4);
        Document d2 = new Document("AP2", 6);
        Document d3 = new Document("AS", 10);
        Document d4 = new Document("AD", 7);
//        Document d5 = new Document("AR", 5);
//        Document d6 = new Document("AE", 6);
//        Document d7 = new Document("AG", 3);
//        Document d8 = new Document("AT", 2);
//        Document d9 = new Document("AX", 1);
//        Document d10 = new Document("AF", 35);

        //adding
        docs.push(d1);
        docs.push(d2);
        docs.push(d3);
        docs.push(d4);
//        docs.push(d5);
//        docs.push(d6);
//        docs.push(d7);
//        docs.push(d8);
//        docs.push(d9);
//        docs.push(d10);

        int totalPages = 0;
        int nextDocument = 0;
        StringBuilder dataNameDocument = new StringBuilder();
        int dataPageDocument = 0;

        ArrayList<Integer> pages= new ArrayList<>();

        //printing
        while (!docs.isEmpty()){
            Document doc = docs.pop();
            System.out.println("\nprinting...");
            System.out.println("Name: " + doc.getName() + ", Number of pages: " + doc.getNumberOfPages());

            pages.add(doc.getNumberOfPages()); // Discovering the biggest document
            totalPages +=doc.getNumberOfPages();
            nextDocument++;

            if (nextDocument % 2 == 0){
                if (!docs.isEmpty()) {
                    Document nextDoc = docs.peek();
                    System.out.println("\nNext document\nName: " + nextDoc.getName() + ", Number of pages: " + nextDoc.getNumberOfPages());
                }            }
        }

        Collections.sort(pages);
        Integer lastPage = pages.get(pages.size() - 1);

        docs.push(d1);
        docs.push(d2);
        docs.push(d3);
        docs.push(d4);
//        docs.push(d5);
//        docs.push(d6);

        // Finding the biggest document(s)
        while (!docs.isEmpty()) {
            Document doc = docs.pop();
            if (doc.getNumberOfPages() == lastPage) {
                dataNameDocument.append(doc.getName());
                dataPageDocument += doc.getNumberOfPages();
            }
        }

        System.out.println("\n- The biggest document - "+ "\nName: "+dataNameDocument +"\nNumber of pages: "+dataPageDocument+"\n"+"\nTotal pages printed: "+ totalPages);
    }

}
