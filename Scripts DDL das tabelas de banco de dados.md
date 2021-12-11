# Scripts DDL das tabelas de banco de dados

- create database if not exists scf_controlefinanceiro;
- show databases;
- use scf_controlefinanceiro;
- select database();
- create table usuario (
usuarioId int primary key auto_increment not null,
usuario_nome varchar(50) not null,
usuario_login varchar(50) not null,
usuario_senha varchar(50) not null
);
- describe usuario;
- create table categoria_lancamentofinanceiro(
categoriaId int primary key auto_increment not null,
descricao_categoria varchar(20) not null
);
- describe categoria_lancamentofinanceiro;
- create table lancamentofinanceiro(
lancamentoId int primary key auto_increment not null,
tipolancamento varchar(10) not null,
descricao varchar(50) not null,
valor float not null,
status_lancamento varchar(10) not null,
data_lancamento date not null,
cod_categoria int not null,
cod_usuario int not null
);
- describe lancamentofinanceiro;
- alter table `scf_controlefinanceiro`.`lancamentofinanceiro`
add constraint `cod_usuario`
foreign key (`cod_usuario`)
references `scf_controlefinanceiro`.`usuario` (`usuarioid`)
on delete no action
on update no action;
- alter table `scf_controlefinanceiro`.`lancamentofinanceiro`
add constraint `cod_categoria`
foreign key (`cod_categoria`)
references `scf_controlefinanceiro`.`categoria_lancamentofinanceiro` (`categoriaid`)
on delete no action
on update no action;
