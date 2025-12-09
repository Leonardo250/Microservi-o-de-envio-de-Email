package com.leo.email.repsitories;

import com.leo.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel,Long> {
}
