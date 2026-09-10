@Entity(name="tb_cliente")
@Getters
@NoArgsConstructor

class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String documento;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = false)
    private String telefone;
    @Column(nullable = false, unique = false)
    private String endereco;
    @Column(nullable = false, unique = false)
    private String dataNascimento;
}