package com.academicquest.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GrupoUpdateDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	private Long alunoLiderId;
	
	private List<Long> listaAlunosId;

}
