Thonk
=====

A Comprehensive Interactive Guide to all Scientific Knowledge

ssh access available a ubuntu@54.209.168.203
server is being for now financially supported by ben
so donations welcome! Ask Ben or Andy for the password.
Glassfish admin user name is admin and the password
is the same as the linux user's (ubuntu) password.

Project is located at ~/Thonk (/home/ubuntu/Thonk)
to build the project run:

```bash
cd ~/Thonk
mvn deploy
```

editing on the server is not advised but if necessary do:
```bash
git add .
git commit
git push origin master
```

The project package file is located at
```bash
/home/ubuntu/Thonk/target/thonk.war
```
Glassfish server files are located in
```bash
/opt/glassfish4
```

to start the server run 
```bash
/opt/glassfish4/bin/asadmin start-domain
```
Server admin console is located at https://54.209.168.203:4848/
for more information about using glassfish and deploying the 
application go to https://glassfish.java.net/documentation.html
