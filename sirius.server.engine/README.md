---
title: Sirius Server Engine Overview
---

# Introduction 

Sirius Server Engine is the main entry point for server side of Sirius Test Automation Platform created for:
* Start entire Sirius Server process. It's started from command line
* Load all included Sirius server side components based on [configuration](https://github.com/mkolisnyk/Sirius/wiki/Server:-configuration-guide)
* Provide the interface to control the server side activities

It is [delivered](http://code.google.com/p/sirius-platform/downloads/list) as executable Java archive initiated from command line. 

# Getting started

## Command line format

The Sirius Server eEngine is invoked by command line like:
```dos
java -jar sirius.server.engine-<version number>.jar [-host <hostname>] [-port <port number>] [-config <path to configuration file>]
```
where parameters are:
* **-host <hostname>** - The host name for the Sirius Server to listen to. **Default value:** localhost
* **-port <port number>** - The host name for the Sirius Server to listen to. **Default value:** 21212
* **-config <path to configuration file>** - Path to the configuration file to read the modules to load from. **Default value:** .\modules.csv

The indicator that server was started successfully is the console output message like:
```dos
2013-04-03 02:09:25,089              INFO   [Log4J] Uploading binary file:./sirius.server.web-(.*).jar
2013-04-03 02:09:25,097              INFO   [Log4J] Starting endpoint: http://localhost:21212/web/select
2013-04-03 02:09:25,204              INFO   [Log4J] Done...
```
For each module it indicates that the module was loaded. No exceptions means that no errors occured during each endpoint start.

## Customizing host and port

In some cases there's a need to customize the host and port to listen to. Major reasons are:
* The default **21212** port is busy with some other application. So, we should use another one port number
* We want to invoke server methods from another machine. The default **localhost** host name is viewable only locally. So, if we need to give an access to our service from outside workstations we should define the host name which should be visible from those locations
* We want to use multiple Sirius Server Engine instances on the same machine. Since only one of those instances can listen to each specific port any other instances should use some other port numbers

## Customizing the set of modules to load

In some cases we need to make light-weight Sirius Server run so that only some sub-set of functionality is accessible. E.g. if we test purely Win32 application we don't need Web modules to load. For this purpose we should customize the list of modules to load. 

It is defined in the configuration file specified by the **-config** parameter. The configuration file itself is the plain text comma-separated file of the following format:

```
Endpoint          , Class                 , Package
<endpoint address>, <class canonical name>, <path to jar file to load class from>
```
where:
* **<endpoint address>** - the URL the service endpoint listens to
* **<class canonical name>** - the canonical name of the Java class implementing methods accesible from the specified endpoint
* **<path to jar file to load class from>** - the path to **jar** file to load the endpoint implementation class from. 
Additionally the following speacial words are supported:
* **${HOST}** - (used only for endpoint names) the host name specified in the command line parameter
* **${PORT}** - (used only for endpoint names) the port number specified in the command line parameter
* **\#** - if line starts with this character it is treated as the comment and ignored during processing

What is the fastest way to check that your custom endpoint was loaded and can be used? For this purpose you should:
1. Open you browser
1. Navigate to the URL like: **<endpoint address>?wsdl**
1. If you see the WSDL content it indicates that you can use your endpoint
1. If there're any errors you should investigate what causes them

# Related topics/samples

* [Sirius: Adding New Component Demo](https://www.youtube.com/watch?v=GnENGO3M5is)

# Links  

* [GitHub project](https://github.com/mkolisnyk/Sirius)
* [Dedicated blog entries](http://mkolisnyk.blogspot.com/search/label/Sirius)

Authors
======
Myk Kolisnyk (kolesnik.nickolay@gmail.com) 

<a href="http://ua.linkedin.com/pub/mykola-kolisnyk/14/533/903"><img src="http://www.linkedin.com/img/webpromo/btn_profile_bluetxt_80x15.png" width="80" height="15" border="0" alt="View Mykola Kolisnyk's profile on LinkedIn"></a>
<a href="http://plus.google.com/108480514086204589709?prsrc=3" rel="publisher" style="text-decoration:none;">
<img src="http://ssl.gstatic.com/images/icons/gplus-16.png" alt="Google+" style="border:0;width:16px;height:16px;"/></a>
