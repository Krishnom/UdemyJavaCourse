package examples.polymorphism;

public class RajaHindustani extends Movie {
    @Override
    public String getName() {
        return "Raja Hindustani";
    }

    @Override
    public void plot() {
        System.out.println("Garib Raja aur Amir Aarti mein pyar. Gaya \"Itna sona tujhe rab ne banaya\"");
        System.out.println("Aarti k baap ne banaya Raja k garibi ka majak");
        System.out.println("Raja aur Aarti nikale apni nayi duniya mein");
        System.out.println("Baapu ne kiya emotional aur kar diya dono ko alag");
        System.out.println("Happy ending mein gaya \"O mere, Pardesi, Jana nahi\"");
    }
}
