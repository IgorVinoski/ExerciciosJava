package Integrando_Estruturas_de_controle;

public class Exercicio12 {
    public static void main(String[] args) {
        /*
        Muitas canções populares são baseadas em padrões repetitivos. Logo é
possível construir algoritmos que montem suas letras a partir desses padrões
que se repetem.
Escreva um programa em Java que gere e mostre no terminal shell
(console) a letra da popular canção norte-americana de Natal “The Twelve Days
of Christmas” transcrita abaixo. Utilize estruturas de controle e não
simplesmente um System.out.print ou println em toda a música.


On the first day of Christmas, my love gave to me a
partridge in a pear tree.
On the second day of Christmas, my love gave to me two
turtle doves,
and a partridge in a pear tree.
On the third day of Christmas, my love gave to me
three french hens,
two turtle doves,
and a partridge in a pear tree.
On the fourth day of Christmas, my love gave to me
four calling birds,
three french hens,
two turtle doves,
and a partridge in a pear tree.
On the fifth day of Christmas, my love gave to me five
gold rings,
four calling birds,
three french hens,
two turtle doves,
and a partridge in a pear tree.
On the sixth day of Christmas, my love gave to me six
geese a-laying,
five gold rings,
four calling birds,
three french hens,
two turtle doves,
and a partridge in a pear tree.
On the seventh day of Christmas, my love gave to me
seven swans a-swimming,
six geese a-laying,
five gold rings,
four calling birds,
three french hens,
two turtle doves,
and a partridge in a pear tree.
On the eighth day of Christmas, my love gave to me
eight maids a-milking,
seven swans a-swimming,
six geese a-laying,
five gold rings,
four calling birds,
three french hens,
two turtle doves,
and a partridge in a pear tree.
On the ninth day of Christmas, my love gave to me nine
ladies waiting,
eight maids a-milking,
seven swans a-swimming,
six geese a-laying,
five gold rings,
four calling birds,
three french hens,
two turtle doves,
and a partridge in a pear tree.
On the tenth day of Christmas, my love gave to me ten
lords a-leaping,
nine ladies waiting,
eight maids a-milking,
seven swans a-swimming,
six geese a-laying,
five gold rings,
four calling birds,
three french hens,
two turtle doves,
and a partridge in a pear tree.
On the eleventh day of Christmas, my love gave to me
eleven pipers piping,
ten lords a-leaping,
nine ladies waiting,
eight maids a-milking,
seven swans a-swimming,
six geese a-laying,
five gold rings,
four calling birds,
three french hens,
two turtle doves,
and a partridge in a pear tree.
On the twelfth day of Christmas, my love gave to me
twelve drummers drumming,
eleven pipers piping,
ten lords a-leaping,
nine ladies waiting,
eight maids a-milking,
seven swans a-swimming,
six geese a-laying,
five gold rings,
four calling birds,
three french hens,
two turtle doves,
and a partridge in a pear tree.
         */


        int n1;

        for(int i=1; i<=12; i++){
            String default1 = "On the " + i + "ª day of Christmas, my love gave to me";
            String part1 = "a partridge in a pear tree.";
            String part2 = "two turtle doves,";
            String part3 = "three french hens, ";
            String part4 = "four calling birds,";
            String part5 = "five gold rings,";
            String part6 = " six geese a-laying,";
            String part7 = "seven swans a-swimming, ";
            String part8 = "eight maids a-milking,";
            String part9 = "nine ladies waiting,";
            String part10= "ten lords a-leaping,";
            String part11= "eleven pipers piping,";
            String part12 = "twelve drummers drumming,";
            switch (i){
                case 1:

                    System.out.println(default1 + part1);
                case 2:

                    System.out.println(default1 + part1 + part2);
                case 3:
                    System.out.println(default1 + part1 + part2 + part3);
                case 4:
                    System.out.println(default1 + part1 + part2 + part3 + part4);
                case 5:
                    System.out.println(default1 + part1 + part2 + part3 + part4 + part5);
                case 6:
                    System.out.println(default1 + part1 + part2 + part3 + part4 + part5 + part6 );
                case 7:
                    System.out.println(default1 + part1 + part2 + part3 + part4 + part5 + part6 + part7 );
                case 8:
                    System.out.println(default1 + part1 + part2 + part3 + part4 + part5 + part6 + part7 + part8 );
                case 9:
                    System.out.println(default1 + part1 + part2 + part3 + part4 + part5 + part6 + part7 + part8 + part9 );
                case 10:
                    System.out.println(default1 + part1 + part2 + part3 + part4 + part5 + part6 + part7 + part8 + part9 + part10);
                case 11:
                    System.out.println(default1 + part1 + part2 + part3 + part4 + part5 + part6 + part7 + part8 + part9 + part10 + part11);
                case 12:
                    System.out.println(default1 + part1 + part2 + part3 + part4 + part5 + part6 + part7 + part8 + part9 + part10 + part11 + part12);


            }

        }
    }
}
