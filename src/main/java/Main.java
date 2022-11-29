import avlTree.ArvoreAVL;
import avlTree.Elemento;
import dao.ProdutosDAO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutosDAO dao = new ProdutosDAO();


        ArvoreAVL supermercados = new ArvoreAVL();
        supermercados = dao.createTree("supermercados");
        ArvoreAVL lacteos = new ArvoreAVL();
        lacteos = dao.createTree("lacteos");
        ArvoreAVL frutas_y_verduras = new ArvoreAVL();
        frutas_y_verduras = dao.createTree("frutas-y-verduras");
        ArvoreAVL carniceria = new ArvoreAVL();
        carniceria = dao.createTree("carniceria");
        ArvoreAVL despensa = new ArvoreAVL();
        despensa  = dao.createTree("despensa");



        Scanner ler = new Scanner(System.in);

        int menu = 0;

        while (menu != 4) {
            System.out.printf("\n\n\n============= OPÇÕES DE TEXTO =============\n");
            System.out.println("1 - Pesquisar Produto: ");
            System.out.println("2 - Visualizar Produtos: ");
            System.out.println("3 - Excluir Produto");
            System.out.println("4 - Sair");
            System.out.println("==============================================");
            System.out.println("==Por gentileza escolha uma opção de [1-4]: ==");
            System.out.println("==============================================");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    int idProduto = 0;
                    System.out.println("============= Pesquisar Produto =============");
                    System.out.println("=============     CATEGORIAS   =============");
                    System.out.println("1 - Supermercado. ");
                    System.out.println("2 - Lácteos. ");
                    System.out.println("3 - Frutas e Verduras. ");
                    System.out.println("4 - Açougue. ");
                    System.out.println("5 - Despensa. ");
                    System.out.println("6 - Voltar");
                    System.out.println("==============================================");
                    System.out.println("==Por gentileza escolha uma opção de [1-6]: ==");
                    System.out.println("==============================================");
                    menu = ler.nextInt();
                    switch (menu){

                        case 1:
                            System.out.println("Digite a o ID do produto que deseja buscar: ");
                            idProduto = ler.nextInt();
                            if(supermercados.busca(idProduto) == true){
                                System.out.println("Nome: ");
                                System.out.println(dao.retornaNome(idProduto));

                            }else {
                                System.out.println("Produto nao encontrado");
                            }
                            break;
                        case 2:

                            System.out.println("Digite a o ID do produto que deseja buscar: ");
                            idProduto = ler.nextInt();
                            if(lacteos.busca(idProduto) == true){
                                System.out.println("Nome: ");
                                System.out.println(dao.retornaNome(idProduto));
                            }else {
                                System.out.println("Produto nao encontrado");
                            }

                            break;

                        case 3:
                            System.out.println("Digite a o ID do produto que deseja buscar: ");
                            idProduto = ler.nextInt();
                            if(frutas_y_verduras.busca(idProduto) == true){
                                System.out.println("Nome: ");
                                System.out.println(dao.retornaNome(idProduto));
                            }else {
                                System.out.println("Produto nao encontrado");
                            }
                            break;

                        case 4:
                            System.out.println("Digite a o ID do produto que deseja buscar: ");
                            idProduto = ler.nextInt();
                            if(carniceria.busca(idProduto) == true){
                                System.out.println("Nome: ");
                                System.out.println(dao.retornaNome(idProduto));
                            }else {
                                System.out.println("Produto nao encontrado");
                            }
                            break;

                        case 5:
                            System.out.println("Digite a o ID do produto que deseja buscar: ");
                            idProduto = ler.nextInt();
                            if(despensa.busca(idProduto) == true){
                                System.out.println("Nome: ");
                                System.out.println(dao.retornaNome(idProduto));
                            }else {
                                System.out.println("Produto nao encontrado");
                            }
                            break;
                        case 6:
                            System.out.println("OK");
                            break;
                        default:
                            System.out.println("Opção Invalida!");
                            break;

                    }
                break;

                case 2:
                    System.out.println("============= Visualizar Produtos =============");
                    System.out.println("=============     CATEGORIAS   =============");
                    System.out.println("1 - Supermercado. ");
                    System.out.println("2 - Lácteos. ");
                    System.out.println("3 - Frutas e Verduras. ");
                    System.out.println("4 - Açougue. ");
                    System.out.println("5 - Despensa. ");
                    System.out.println("6 - Sair");
                    System.out.println("==============================================");
                    System.out.println("==Por gentileza escolha uma opção de [1-6]: ==");
                    System.out.println("==============================================");
                    menu = ler.nextInt();
                    switch (menu){
                        case 1:
                            System.out.println("Imprimindo em ordem");
                            supermercados.imprimirInOrdem();
                            break;
                        case 2:
                            System.out.println("Imprimindo em ordem");
                            lacteos.imprimirInOrdem();
                            break;
                        case 3:
                            System.out.println("Imprimindo em ordem");
                            frutas_y_verduras.imprimirInOrdem();
                            break;
                        case 4:
                            System.out.println("Imprimindo em ordem");
                            carniceria.imprimirInOrdem();
                            break;

                        case 5:
                            System.out.println("Imprimindo em ordem");
                            despensa.imprimirInOrdem();
                            break;

                        case 6:

                            System.out.println("SISTEMA ENCERRADO!");

                            break;

                        default:

                            System.out.println("Opção Invalida!");
                            break;

                    }
                    break;

                case 3:

                    System.out.println("=============  Excluir Produto  ============");
                    System.out.println("=============     CATEGORIAS   ============= ");
                    System.out.println("1 - Supermercado. ");
                    System.out.println("2 - Lácteos. ");
                    System.out.println("3 - Frutas e Verduras. ");
                    System.out.println("4 - Açougue. ");
                    System.out.println("5 - Despensa. ");
                    System.out.println("6 - Sair");
                    System.out.println("==============================================");
                    System.out.println("==Por gentileza escolha uma opção de [1-6]: ==");
                    System.out.println("==============================================");
                    int idPRemover = 0;
                    menu = ler.nextInt();
                    switch (menu){
                        case 1:
                            System.out.println("Escreva o id do produto que deseja remover: ");
                            idPRemover = ler.nextInt();
                            if (supermercados.busca(idPRemover)==true){
                                supermercados.remover(idPRemover);
                                System.out.println("Produto removido com sucesso! ");
                            }else{
                                System.out.println("Produto nao encontrado ");
                            }
                            break;
                        case 2:
                            System.out.println("Escreva o id do produto que deseja remover: ");
                            idPRemover = ler.nextInt();
                            if (lacteos.busca(idPRemover)==true){
                                lacteos.remover(idPRemover);
                                System.out.println("Produto removido com sucesso! ");
                            }else{
                                System.out.println("Produto nao encontrado ");
                            }
                            break;

                        case 3:
                            System.out.println("Escreva o id do produto que deseja remover: ");
                            idPRemover = ler.nextInt();
                            if (frutas_y_verduras.busca(idPRemover)==true){
                                frutas_y_verduras.remover(idPRemover);
                                System.out.println("Produto removido com sucesso! ");
                            }else{
                                System.out.println("Produto nao encontrado ");
                            }
                            break;

                        case 4:
                            System.out.println("Escreva o id do produto que deseja remover: ");
                            idPRemover = ler.nextInt();
                            if (carniceria.busca(idPRemover)==true){
                                carniceria.remover(idPRemover);
                                System.out.println("Produto removido com sucesso! ");
                            }else{
                                System.out.println("Produto nao encontrado ");
                            }
                            break;

                        case 5:
                            System.out.println("Escreva o id do produto que deseja remover: ");
                            idPRemover = ler.nextInt();
                            if (despensa.busca(idPRemover)==true){
                                despensa.remover(idPRemover);
                                System.out.println("Produto removido com sucesso! ");
                            }else{
                                System.out.println("Produto nao encontrado ");
                            }
                            break;

                        case 6:
                            System.out.println("SISTEMA ENCERRADO!");
                            break;
                        default:
                            System.out.println("Opção Invalida!");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("SISTEMA ENCERRADO!");

                    break;
                default:
                    System.out.println("Opção Invalida!");

                    break;

            }
        }



    }
}
