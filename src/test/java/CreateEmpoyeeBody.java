import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateEmpoyeeBody {
//    {"name":"test","salary":"123","age":"23"}
    private String name;
    private String salary;
    private String age;

}
