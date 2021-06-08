create table proprietaire(
 id_pro varchar2(10) primary key,
 nom varchar2(20) not null,
 prenom varchar2(20) not null,
 numtel varchar2(15) not null,
 ville varchar2(20) not null,
 email varchar2(25) not null unique,
 pass varchar2(100) not null,
) 

create table animal(
 id_an varchar2(10) primary key,
 id_pro varchar2(10),
 nom_an varchar2(15) not null,
 age number(10) not null,
 poids varchar2(10) ,
 race varchar2(10) not null,
 sexe varchar2(10) not null,
 couleur varchar2(10) not null,
 description varchar2(1000) not null,
 constraint fk_id_pro foreign key(id_pro) 
 references proprietaire(id_pro) on delete cascade
)

create sequence id_pro_c
create sequence id_an_c 

insert into proprietaire values
('P' || id_pro_c.nextval,'nom','prenom','numtel','ville',
'email','pass')
insert into proprietaire values
('A' || id_pro_c.nextval,'nom','prenom','numtel','ville',
'email','pass')

            <%
                if (session.getAttribute("id") == null) {
                    ResultSet R = Connexion.Seconnecter().createStatement().executeQuery("select * from animal");
                    while (R.next()) {
                        out.print(" <div class = 'child'>  "
                                + " <img style ='margin-top:10px; width:300px;'src = '../PNG/icons-avatar.png' width='150px' height='150px'>"
                                + "<h2 style = ' text-shadow:none;' > NAME : " + R.getObject(3) + " </h2>"
                                + "<h3> TYPE : " + R.getObject(6) + " </h3>"
                                + "<div class = 'separation' > </div>"
                                + "<p style = 'text-transform:capitalize;'> description of the animal <br> " + R.getObject(9) + " </p>"
                                + "</div>");
                    }
                } else {
                    ResultSet R = Connexion.Seconnecter().createStatement().executeQuery("select * from animal where ID_PRO ='" + request.getSession().getAttribute("id") + "'");
                    out.print(R);
                    while (R.next()) {
                        out.print(" <div class = 'child'>  "
                                + " <img style ='margin-top:10px; width:300px;'src = '../PNG/icons-avatar.png' width='150px' height='150px'>"
                                + "<h2 style = ' text-shadow:none;' > NAME : " + R.getObject(3) + " </h2>"
                                + "<h3> TYPE : " + R.getObject(6) + " </h3>"
                                + "<div class = 'separation' > </div>"
                                + "<p style = 'text-transform:capitalize;'> description of the animal <br> " + R.getObject(9) + " </p>"
                                + "</div>");
                    }
                }

            %>