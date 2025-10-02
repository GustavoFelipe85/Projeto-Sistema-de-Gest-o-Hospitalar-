# 🏥 MediCare - Sistema de Gestão Hospitalar

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![C#](https://img.shields.io/badge/C%23-239120?style=for-the-badge&logo=c-sharp&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
![.NET](https://img.shields.io/badge/.NET-5C2D91?style=for-the-badge&logo=.net&logoColor=white)

Sistema completo para gestão de hospitais e clínicas com frontend moderno e duas opções de backend.

## ✨ Funcionalidades

- 🏥 **Gestão de Pacientes** - Cadastro completo e histórico médico
- 📅 **Agendamentos** - Controle de consultas e exames
- 📋 **Prontuários Eletrônicos** - Registros digitais seguros
- 👨‍⚕️ **Gestão de Médicos** - Cadastro e especialidades
- 📊 **Relatórios** - Estatísticas e relatórios gerenciais

## 🛠️ Tecnologias Utilizadas

### Frontend
- HTML5, CSS3, JavaScript
- Design Responsivo
- Interface Moderna e Intuitiva

### Backend (Duas Implementações)
- **Java**: Spring Boot, JPA/Hibernate, MySQL
- **C#**: .NET 6, Entity Framework, SQL Server

## 📋 Pré-requisitos

- Java 11+ ou .NET 6
- MySQL ou SQL Server
- Node.js (para desenvolvimento frontend)

## 🚀 Como Executar

### Backend Java
```bash
cd backend-java
mvn spring-boot:run

```

### Backend C#
```bash
cd backend-csharp/MediCare.API
dotnet run
```

### Frontend
```bash
cd frontend
# Abra index.html no navegador ou use:
python -m http.server 8000
```

## 📝 API Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/api/pacientes` | Listar pacientes |
| POST | `/api/pacientes` | Criar paciente |
| GET | `/api/pacientes/{id}` | Buscar paciente |
| PUT | `/api/pacientes/{id}` | Atualizar paciente |
| DELETE | `/api/pacientes/{id}` | Excluir paciente |

## 🤝 Contribuição

1. Faça o fork do projeto
2. Crie uma branch: `git checkout -b feature/nova-feature`
3. Commit suas mudanças: `git commit -m 'Add nova feature'`
4. Push para a branch: `git push origin feature/nova-feature`
5. Abra um Pull Request

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para detalhes.

---

**Desenvolvido por [Gustavo Felipe](https://github.com/GustavoFelipe85)** 🚀
