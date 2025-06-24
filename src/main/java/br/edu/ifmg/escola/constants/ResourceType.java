package br.edu.ifmg.escola.constants;

public enum ResourceType {


    LESSON_ONLY("Licao"),
    LESSON_TASK("Tarefa"),
    FORUM("Forum"),
    EXTERNAL_LINK("Link Externo"),;

    private String description;

    private ResourceType(String description) {
        this.description = description;
    }
}
