package co.edu.konrad.marketplace.entities;

import co.edu.konrad.marketplace.entities.TipoDocumentoEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-22T08:54:04")
@StaticMetamodel(ClienteEntity.class)
public class ClienteEntity_ { 

    public static volatile SingularAttribute<ClienteEntity, TipoDocumentoEntity> tipoDocumento;
    public static volatile SingularAttribute<ClienteEntity, Long> idCliente;
    public static volatile SingularAttribute<ClienteEntity, String> nombreCliente;
    public static volatile SingularAttribute<ClienteEntity, Date> fechaNacimiento;
    public static volatile SingularAttribute<ClienteEntity, String> apellidoCliente;
    public static volatile SingularAttribute<ClienteEntity, Integer> numeroDocumento;

}