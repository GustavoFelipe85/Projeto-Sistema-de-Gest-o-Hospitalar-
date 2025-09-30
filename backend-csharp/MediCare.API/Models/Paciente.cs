using System.ComponentModel.DataAnnotations;

namespace MediCare.API.Models
{
    public class Paciente
    {
        public int Id { get; set; }

        [Required]
        [StringLength(100)]
        public string Nome { get; set; } = string.Empty;

        [Required]
        [StringLength(11)]
        public string CPF { get; set; } = string.Empty;

        [DataType(DataType.Date)]
        public DateTime DataNascimento { get; set; }

        [StringLength(20)]
        public string? Telefone { get; set; }

        [EmailAddress]
        [StringLength(100)]
        public string? Email { get; set; }

        public DateTime DataCadastro { get; set; } = DateTime.Now;
    }
}
