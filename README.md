## A JAVA implementation of the CoAP

This implementation of the Constrained Application Protocol bases on the asynchronous and event-driven network
application framework [Netty](http://netty.io) (thats where the 'n' in nCoAP comes from). The nCoAP framework
currently covers

* the raw protocol ([RFC 7252](https://tools.ietf.org/html/rfc7252)),
* the observation of CoAP resources ([RFC 7641](https://tools.ietf.org/html/rfc7641)),
* the blockwise transfer ([draft 19](https://tools.ietf.org/html/draft-ietf-core-block-19)),
* the identification of endpoints with changing IPs
([draft 01](https://tools.ietf.org/html/draft-kleine-core-coap-endpoint-id-01)) , and
* the CoRE Link Format ([RFC 6690](https://tools.ietf.org/html/rfc6690)).

but without DTLS (i.e. support for the coaps scheme). 

### Latest SNAPSHOT version (1.8.3-SNAPSHOT)

JavaDoc is available [here](https://media.itm.uni-luebeck.de/people/kleine/javadoc/ncoap-core/1.8.3-SNAPSHOT/). The
nCoAP project is organized in several maven modules, i.e.,

```xml
<groupId>de.uzl.itm</groupId>
<artifactId>ncoap-core</artifactId>
```

for the raw protocol implementation (including the extensions mentioned above). For CoAP application development this
is probably what you want. Note, that for several reasons some interfaces and package names changed since the latest
stable version (1.8.2). To use the latest bleeding edge version add the following to your pom.xml:

```xml
<repositories>
...
    <repository>
        <id>itm-maven-repository-snapshots</id>
        <name>ITM Maven Snapshots Repository</name>
        <url>https://maven.itm.uni-luebeck.de/content/repositories/snapshots</url>
    </repository>
...
</repositories>
```

...

```xml
<dependencies>
...
    <dependency>
        <groupId>de.uzl.itm</groupId>
        <artifactId>ncoap-core</artifactId>
        <version>1.8.3-SNAPSHOT</version>
    </dependency>
...
</dependencies>
```


### Examples for Client and Server 

The other models, i.e.,

```xml
<groupId>de.uzl.itm</groupId>
<artifactId>ncoap-simple-client</artifactId>
```

and

```xml
<groupId>de.uzl.itm</groupId>
<artifactId>ncoap-simple-server</artifactId>
```

provide simple CoAP applications for both, client and server. There intention is to highlight, how easy it is to
write such applications using ncoap.