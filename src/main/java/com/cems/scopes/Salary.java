package com.cems.scopes;

import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Component;

@Component
@Description("Salary for an employee might change, so this is a suitable example for a protoype scoped bean")
public class Salary {
}
