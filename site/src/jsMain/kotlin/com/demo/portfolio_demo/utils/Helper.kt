package com.demo.portfolio_demo.utils

import com.demo.portfolio_demo.components.model.Researches
import com.demo.portfolio_demo.components.model.WorkExperience

fun getAllWritings() =
    listOf(
        Pair(Res.Images.WRITING_IMAGE_08, Constants.TUMBLR_URL),
        Pair(Res.Images.WRITING_IMAGE_09, ""),
    )

fun getAllWorkExperience() = listOf(
    WorkExperience(
        sequenceNumber = "01",
        role = "Program Officer (Education)",
        organization = "Unnayan Sangha (Jamalpur)",
        duration = "Dec 2021 - June 2023"
    ),
    WorkExperience(
        sequenceNumber = "02",
        role = "ESL Trainer (Part-time)",
        organization = "Reliable Global Studies",
        duration = "2021 - Present"
    ),
    WorkExperience(
        sequenceNumber = "03",
        role = "IB PYP Teacher",
        organization = "Abdul Kadir Mollah International School",
        duration = "2018 - 2019"
    ),
    WorkExperience(
        sequenceNumber = "04",
        role = "English Language and Literature Teacher",
        organization = "Bangladesh International Tutorial (BIT)",
        duration = "2017 - 2018"
    ),
    WorkExperience(
        sequenceNumber = "05",
        role = "SSURDA Communication Officer",
        organization = "Society for Sustainable Development or the Rural and Urban Area (SSURDA)",
        duration = "2015 - 2017"
    )
)

fun getAllPhotographs() =
    listOf(
        Res.Images.IMAGE_1,
        Res.Images.IMAGE_2,
        Res.Images.IMAGE_3,
        Res.Images.IMAGE_4,
        Res.Images.IMAGE_5,
        Res.Images.IMAGE_6,
        Res.Images.IMAGE_7,
        Res.Images.IMAGE_8,
    )

fun getAllResearch() = listOf(
    Researches(
        title = "Coetzee’s Disgrace: Rape and Escape connection to Bangladeshi perspectives.",
        subTitle = "ARJEL (American Research Journal of English language and Literature) Volume 7 DOI: : 10.21694/2378-9026.21009",
        link = "https://www.arjonline.org/papers/arjel/v7-i1/9.pdf",
        type = "Published"
    ),
    Researches(
        title = "A 3D Saga of Bangladeshi Woman (divorced, diluted and deprived vs dream, determined and destination).",
        subTitle = "",
        link = "",
        type = "Ongoing"
    ),
    Researches(
        title = "Low budget framed quality Educations and SEEDS project by UNNAYAN Sangha.",
        subTitle = "",
        link = "",
        type = "Ongoing"
    ),
    Researches(
        title = "Significant ethnographic case studies “Rohingyas” and trivial people: identity crisis and threat to peace.",
        subTitle = "",
        link = "",
        type = "Ongoing"
    ),
    Researches(
        title = "SHOFOL as a successful project for the indigenous orphaned children and achievements.",
        subTitle = "",
        link = "",
        type = "Ongoing"
    ),
    Researches(
        title = "Distinctive Features and Socioeconomic Impacts of Chinese Foreign Aid in Recipient Nations.",
        subTitle = "",
        link = "",
        type = "Unpublished"
    ),
    Researches(
        title = "Intersectionality in Global Development: A Critical Analysis of Theoretical Approaches and Applied Practices.",
        subTitle = "",
        link = "",
        type = "Unpublished"
    ),
    Researches(
        title = "Women sexism and South Asian dogma: A Momentum looks into the Kamla Das poetry.",
        subTitle = "",
        link = "",
        type = "Unpublished"
    ),
    Researches(
        title = "Revisiting Development Paradigms: Challenging the Illusion of Post-Colonial Progress.",
        subTitle = "",
        link = "",
        type = "Unpublished"
    ),
    Researches(
        title = "Advancing Inclusive Education and Gender Equality: Empowering Indigenous Young Girls in Bangladesh through Quality Learning Opportunities.",
        subTitle = "",
        link = "",
        type = "Unpublished"
    ),
    Researches(
        title = "Understanding the Interplay Between Education and Violent Conflict Through a Human Rights Lens: Case Studies and Implications.",
        subTitle = "",
        link = "",
        type = "Unpublished"
    ),
    Researches(
        title = "Breaking boundaries from theory to practice: A critical assessment of the attempt to integrate Kolbe’s “Experiential Learning Journey” into the educational framework of the National Curriculum and Textbook Board (NCTB) of Bangladesh",
        subTitle = "",
        link = "",
        type = "Unpublished"
    )

)