package co.edu.fenixri.backend.entidades;

import co.edu.fenixri.backend.entidades.Cinturon;
import co.edu.fenixri.backend.entidades.Ficha;
import co.edu.fenixri.backend.entidades.Rendimiento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-05T18:34:25")
@StaticMetamodel(Evolucion.class)
public class Evolucion_ { 

    public static volatile SingularAttribute<Evolucion, Ficha> idFicha;
    public static volatile SingularAttribute<Evolucion, Date> fechaEvolucion;
    public static volatile SingularAttribute<Evolucion, String> peso;
    public static volatile SingularAttribute<Evolucion, Cinturon> idCinturon;
    public static volatile SingularAttribute<Evolucion, Rendimiento> idRendimiento;
    public static volatile SingularAttribute<Evolucion, Integer> idEvolucion;
    public static volatile SingularAttribute<Evolucion, String> estatura;

}