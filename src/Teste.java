

import one.digitainnovation.gof.singleton.SingletonEager;
import one.digitainnovation.gof.singleton.SingletonLazy;
import one.digitainnovation.gof.singleton.SingletonLazyHolder;
import one.digitainnovation.gof.strategy.Comportamento;
import one.digitainnovation.gof.strategy.ComportamentoDefensivo;
import one.digitainnovation.gof.strategy.ComportamentoNormal;
import one.digitainnovation.gof.strategy.Robo;

public class Teste {

  // Singleton
  public static void main(String[] args) {
    SingletonLazy lazy= SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager= SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder lazyHolder= SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);

    // Strategy

    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    
    Robo robo = new Robo();
    robo.setStrategy(normal);

    robo.mover();
    robo.mover();

    robo.setStrategy(defensivo);

    robo.mover();
    robo.mover();
  }
}
