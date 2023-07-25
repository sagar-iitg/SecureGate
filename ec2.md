```

   1  sudo apt update
    2  sudo apt install postgresql postgresql-contrib
    3  sudo systemctl start postgresql.service
    4  sudo systemctl status postgresql
    5  sudo systemctl start postgresql.service
    6  sudo systemctl status postgresql
    7  sudo -i -u postgres
    8  clear
    9  psql -c "admin"
   10  sudo systemctl status postgresql
   11  sudo systemctl daemon-reload
   12  sudo systemctl enable postgresql
   13  sudo systemctl start postgresql
   14  sudo systemctl status postgresql
   15  mkdir certificates
   16  sudo systemctl restart postgresql
   17  sudo systemctl status postgresql
   18  sudo systemctl restart postgre
   19  sudo systemctl restart postgres
   20  cd certificates
   21  openssl req -newkey rsa:2048 -new -nodes -x509 -days 3650 -keyout key.pem -out    cert.pem
   22  export KEYCLOAK_ADMIN_PASSWORD=admin
   23  export DB_PASSWORD=admin
   24  export KEYCLOAK_HOSTNAME=44.202.32.197:8443
   25  docker run -d    --name keycloak-prod   -v /home/ec2-user/certificates:/certificates   --network=host   -e KEYCLOAK_ADMIN=admin   -e KEYCLOAK_ADMIN_PASSWORD=$KEYCLOAK_ADMIN_PASSWORD   quay.io/keycloak/keycloak:latest   start   --features=token-exchange   --https-certificate-file=/certificates/cert.pem   --https-certificate-key-file=/certificates/key.pem   --hostname=$KEYCLOAK_HOSTNAME   --proxy=edge   --db=postgres   --db-url=jdbc:postgres://localhost:5432/postgres   --db-username=postgres   --db-password=$DB_PASSWORD
   26  sudo apt install docker.io
   27  sudo docker run -d    --name keycloak-prod   -v /home/ec2-user/certificates:/certificates   --network=host   -e KEYCLOAK_ADMIN=admin   -e KEYCLOAK_ADMIN_PASSWORD=$KEYCLOAK_ADMIN_PASSWORD   quay.io/keycloak/keycloak:latest   start   --features=token-exchange   --https-certificate-file=/certificates/cert.pem   --https-certificate-key-file=/certificates/key.pem   --hostname=$KEYCLOAK_HOSTNAME   --proxy=edge   --db=postgres   --db-url=jdbc:postgres://localhost:5432/postgres   --db-username=postgres   --db-password=$DB_PASSWORD
   28  sudo docker ps
   29  sudo docker ps -a
   30  sudo docker logs 293
   31  sudo su - postgres
   32  sudo docker run -d    --name keycloak-prod   -v /home/ec2-user/certificates:/certificates   --network=host   -e KEYCLOAK_ADMIN=admin   -e KEYCLOAK_ADMIN_PASSWORD=$KEYCLOAK_ADMIN_PASSWORD   quay.io/keycloak/keycloak:latest   start   --features=token-exchange   --https-certificate-file=/certificates/cert.pem   --https-certificate-key-file=/certificates/key.pem   --hostname=$KEYCLOAK_HOSTNAME   --proxy=edge   --db=postgres   --db-url=jdbc:postgres://localhost:5432/postgres   --db-username=postgres   --db-password=$DB_PASSWORD
   33  sudo dokcer ps -a
   34  sudo docker ps -a
   35  sudo docker rm -f 293
   36  sudo docker run -d    --name keycloak-prod   -v /home/ec2-user/certificates:/certificates   --network=host   -e KEYCLOAK_ADMIN=admin   -e KEYCLOAK_ADMIN_PASSWORD=$KEYCLOAK_ADMIN_PASSWORD   quay.io/keycloak/keycloak:latest   start   --features=token-exchange   --https-certificate-file=/certificates/cert.pem   --https-certificate-key-file=/certificates/key.pem   --hostname=$KEYCLOAK_HOSTNAME   --proxy=edge   --db=postgres   --db-url=jdbc:postgres://localhost:5432/postgres   --db-username=postgres   --db-password=$DB_PASSWORD
   37  sudo docker ps
   38  sudo docker ps -a
   39  sudo docker logs 6d96
   40  ls
   41  cd ..
   42  clear
   43  ls
   44  sudo docker run -d    --name keycloak-prod   -v /home/ec2-user/certificates:/certificates   --network=host   -e KEYCLOAK_ADMIN=admin   -e KEYCLOAK_ADMIN_PASSWORD=$KEYCLOAK_ADMIN_PASSWORD   quay.io/keycloak/keycloak:latest   start   --features=token-exchange   --https-certificate-file=/certificates/cert.pem   --https-certificate-key-file=/certificates/key.pem   --hostname=$KEYCLOAK_HOSTNAME   --proxy=edge   --db=postgres   --db-url=jdbc:postgres://localhost:5432/postgres   --db-username=postgres   --db-password=$DB_PASSWORD
   45  sudo docker ps -a
   46  sudo docker rm 6d9
   47  sudo docker run -d    --name keycloak-prod   -v /home/ec2-user/certificates:/certificates   --network=host   -e KEYCLOAK_ADMIN=admin   -e KEYCLOAK_ADMIN_PASSWORD=$KEYCLOAK_ADMIN_PASSWORD   quay.io/keycloak/keycloak:latest   start   --features=token-exchange   --https-certificate-file=/certificates/cert.pem   --https-certificate-key-file=/certificates/key.pem   --hostname=$KEYCLOAK_HOSTNAME   --proxy=edge   --db=postgres   --db-url=jdbc:postgres://localhost:5432/postgres   --db-username=postgres   --db-password=$DB_PASSWORD
   48  sudo docker ps
   49  clear
   50  sudo docker ps
   51  sudo docker ps -a
   52  sudo docker logs 85
   53  pwd
   54  sudo docker run -d    --name keycloak-prod   -v /home/ubuntu/certificates:/certificates   --network=host   -e KEYCLOAK_ADMIN=admin   -e KEYCLOAK_ADMIN_PASSWORD=$KEYCLOAK_ADMIN_PASSWORD   quay.io/keycloak/keycloak:latest   start   --features=token-exchange   --https-certificate-file=/certificates/cert.pem   --https-certificate-key-file=/certificates/key.pem   --hostname=$KEYCLOAK_HOSTNAME   --proxy=edge   --db=postgres   --db-url=jdbc:postgres://localhost:5432/postgres   --db-username=postgres   --db-password=$DB_PASSWORD
   55  sudo docker ps -a
   56  sudo docker rm 85
   57  sudo docker run -d    --name keycloak-prod   -v /home/ubuntu/certificates:/certificates   --network=host   -e KEYCLOAK_ADMIN=admin   -e KEYCLOAK_ADMIN_PASSWORD=$KEYCLOAK_ADMIN_PASSWORD   quay.io/keycloak/keycloak:latest   start   --features=token-exchange   --https-certificate-file=/certificates/cert.pem   --https-certificate-key-file=/certificates/key.pem   --hostname=$KEYCLOAK_HOSTNAME   --proxy=edge   --db=postgres   --db-url=jdbc:postgres://localhost:5432/postgres   --db-username=postgres   --db-password=$DB_PASSWORD
   58  sudo docker ps
   59  clear
   60  sudo docker ps
   61  clear
   62  sudo docker ps
   63  sudo docker logs f7b
   64  cd certificates
   65  ls
   66  git clone https://github.com/sagar-iitg/SecureGate.git
   67  ls
   68  cp cert.pem SecureGate/
   69  cp key.pem SecureGate/
   70  cd SecureGate/
   71  ls
   72  git status
   73  cp key.pem resource/
   74  cp cert.pem resource/
   75  cd resource/
   76  ls
   77  cd ..
   78  ls
   79  git status
   80  git add .
   81  git commit -am "pem "
   82  git push
   83  git push
   84  history

```
