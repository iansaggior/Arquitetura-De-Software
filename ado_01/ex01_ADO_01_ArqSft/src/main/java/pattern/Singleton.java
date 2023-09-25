/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

/**
 *
 * @author iansa
 */
public class Singleton {
  private static Singleton singleton = new Singleton();
  
  private Singleton(){
  }
  
  public static Singleton getInstance(){
    return singleton;
  }
}

/*
Para implementar uma versão segura do padrão Singleton que não pode ser "quebrada" 
em ambientes multi-threads, você pode usar a inicialização estática do Java e a classe java.util.concurrent. 

Nesta implementação:

A instância única da classe Singleton é criada estáticamente na própria classe. Isso garante que 
a instância seja inicializada apenas uma vez, quando a classe é carregada pelo classloader.

O construtor da classe Singleton é privado, o que significa que não é possível criar 
instâncias da classe fora dela própria.

O método getInstance() fornece acesso à única instância da classe. 
Como a instância já foi criada estáticamente, ele apenas a retorna.

Essa implementação é segura em ambientes multi-threads devido à inicialização estática. 
O classloader garante que a instância seja criada uma única vez, independentemente de quantas threads a acessem. 
Portanto, você não precisa se preocupar com problemas de concorrência ao usar esta implementação do Singleton.

*/