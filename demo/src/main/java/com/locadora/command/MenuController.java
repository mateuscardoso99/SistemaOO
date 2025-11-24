package com.locadora.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuController {

    private final Map<Integer, Command> commands = new HashMap<>();
    private final Scanner scanner;

    public MenuController(Scanner scanner){
        this.scanner = scanner;
    }

    //anexa um novo comando ao menu, exceto 0 que é padrão para sair
    public void addCommand(int option, Command command){
        if(option != 0){
            commands.put(option, command);
        }
    }

    public void start(){
        while (true) {
            System.out.println("======= MENU =======");
            System.out.println("1 - Adicionar mídia Livro");
            System.out.println("2 - Adicionar mídia CD");
            System.out.println("3 - Listar clientes");
            System.out.println("4 - Listar todas as midias");
            System.out.println("5 - Listar livros");
            System.out.println("6 - Listar CDs");
            System.out.println("7 - Buscar Mídias por título");
            System.out.println("8 - Buscar Cliente por email");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            Integer option = Integer.parseInt(scanner.nextLine());

            if(option == 0) break;
            Command invoker = commands.get(option);
            if(invoker != null){
                invoker.execute();
            }
            else{
                System.out.println("Opção inválida");
            }
        }
    }
}
