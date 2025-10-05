insert into estados(descripcion, abreviatura)
values ('Activo', 'ACT'),
       ('Inactivo', 'INC'),
       ('Anulado', 'ANU'),
       ('Vencido', 'VEN');

insert into tipo_pagos(descripcion, abreviatura)
values ('NEQUI', 'NEQUI'),
       ('PSE', 'PSE'),
       ('EFECTIVO', 'EFC');

INSERT INTO public.tipos_membresias (costo, duracion_dias, nombre, descripcion)
VALUES (20.00, 30, 'Básica Mensual',
        'Ideal para usuarios que recién comienzan y prefieren un compromiso de corto plazo.'),
       (50.00, 90, 'Estándar Trimestral',
        'Un plan intermedio con un ligero descuento frente al mensual, promoviendo el compromiso de 3 meses.'),
       (180.00, 365, 'Premium Anual',
        'El mayor compromiso, ofreciendo el mejor valor o el acceso a todas las funcionalidades.'),
       (5.00, 7, 'Prueba Semanal',
        'Una membresía de bajo costo para permitir a los usuarios probar el servicio por una semana.'),
       (15.00, 30, 'Estudiantil Mensual',
        'Un plan con descuento (menor que la Básica Mensual) para un segmento específico como estudiantes.');

INSERT INTO public.roles (descripcion, abreviatura)
VALUES
    ('Administrador', 'ADM'),
    ('Instructor', 'INS'),
    ('Miembro regular', 'MIR');