public class Story {
    public static void intro(){
        GameLogic.clearConsole();
        GameLogic.printHeading("NeoTókio 2087");
        GameLogic.printSeparator(30);
        System.out.println("O ano é 2085 e NeoTokyo é uma cidade à beira do colapso.\nO sistema meteorológico não funciona bem, a cidade está poluída e as pessoas lutam para sobreviver.\nEm meio a esse caos, uma nova droga chamada 'Bliss' surgiu,\noferecendo aos usuários uma fuga temporária de sua dura realidade.");
    }
    
    public static void actI(){
        GameLogic.printSeparator(60);
        System.out.println("Como membro de uma organização de desenvolvimento sustentável, você tem a tarefa de investigar a causa dos problemas da cidade\ne encontrar uma solução que beneficie tanto o meio ambiente quanto as pessoas. Sua investigação o leva a descobrir que a fonte da poluição da cidade são as corporações,\nque despejam lixo tóxico no abastecimento de água da cidade.\n");
        System.out.println("Uma noite, enquanto "+ GameLogic.player.name +" voltava de um protesto para casa,\nele foi atacado por um grupo de mercenários corporativos contratados para silenciá-la.");
        GameLogic.anythingToContinue();
        GameLogic.printSeparator(60);
    }
}