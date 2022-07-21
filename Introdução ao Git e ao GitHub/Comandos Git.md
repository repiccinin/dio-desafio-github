# Comandos Git 🐱‍💻
## Manipular diretórios 📁

```sh
cd > change directory
ls > list directory
ls -a > list directory with hidden files
mkdir > make directory
rm > remove directory
rf > remove file
clear
```

## Config 💻

***Criando sha1: ***
```sh
echo "conteudo" | git hash -object --stdin
echo -e "conteudo" | openssl sha1
```

***Gerar chave SSH: ***
```sh
ssh-keygen -t ed25519 -C fulano@detal.com.br
```

***Adicionar chave SSH pública: ***
```sh
cat id_ed25519.pub
```

***Adicionar chave SSH privada: ***
```sh
ssh-add id_ed25519
```

***Iniciar agent: ***
```sh
eval $(ssh-agent -s)
```

***Criar configuração user.email / user.name: ***
```sh
git config --global user.email "fulano@detal.com.br"
git config --global user.name "Fulano"
```

***Exibir user.email / user.name: ***
```sh
git config --list
```

***Retirar user.email / user.name: ***
```sh
git config --global --unset user.email 
git config --global --unset user.name
```

***Reconfigurar user.email / user.name: ***
```sh
git config --global  user.email "fulano@detal.com.br"
git config --global user.name "fulanodetal"
```

## Comandos de versionamento 🛠

***Clonar repositório: ***
```sh
git clone https://github.com/hideraldus13/roadmap-do-desenvolvedor-web
```

***Iniciar repositório local: ***
```sh
git init
```

***Adicionar Alterações Staging Area: ***
```sh
git add *
git add .
git add filename
```

***Verificar status: ***
```sh
git status
```

***Commit: ***
```sh
git commit -m "mensagem"
```

***Criar arquivo README.md: ***
```sh
echo > README.md
```

***Adicionar caminho do repositório remoto: ***
```sh
git remote add origin https://github.com/fulanodetal/
git config --global user.name "fulanodetal"
```

***Exibir caminho do repositório remoto: ***
```sh
git remote -v
```

***Push das atualizações no repositório remoto: ***
```sh
git push origin main
```

## Resolvendo Merge Conflicts

***Pull das atualizações e auto merge: ***
```sh
git pull origin main
```

***Abortar merge: ***
```sh
git merge --abort
```

-----------------------------
**Author:** ***Regiane Piccinin***
**GitHub:** ***[repiccinin](https://github.com/repiccinin/)***
